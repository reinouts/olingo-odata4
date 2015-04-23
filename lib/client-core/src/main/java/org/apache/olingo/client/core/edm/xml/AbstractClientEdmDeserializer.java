/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.client.core.edm.xml;

import java.io.IOException;

import org.apache.olingo.client.core.edm.xml.annotation.ClientConstantAnnotationExpression;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser;

public abstract class AbstractClientEdmDeserializer<T> extends JsonDeserializer<T> {

  protected boolean isAnnotationConstExprConstruct(final JsonParser jp) throws IOException {
    return ClientConstantAnnotationExpression.Type.fromString(jp.getCurrentName()) != null;
  }

  protected ClientConstantAnnotationExpression parseAnnotationConstExprConstruct(final JsonParser jp)
      throws IOException {
    final ClientConstantAnnotationExpression constExpr = new ClientConstantAnnotationExpression();
    constExpr.setType(ClientConstantAnnotationExpression.Type.fromString(jp.getCurrentName()));
    constExpr.setValue(jp.nextTextValue());
    return constExpr;
  }

  protected ClientReturnType parseReturnType(final JsonParser jp, final String elementName) throws IOException {
    final ClientReturnType returnType;
    if (elementName.equals(((FromXmlParser) jp).getStaxReader().getLocalName())) {
      returnType = new ClientReturnType();
      returnType.setType(jp.nextTextValue());
    } else {
      jp.nextToken();
      returnType = jp.readValueAs(ClientReturnType.class);
    }
    return returnType;
  }

  protected abstract T doDeserialize(JsonParser jp, DeserializationContext ctxt) throws IOException;

  @Override
  public T deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException {
    return doDeserialize(jp, ctxt);
  }
}