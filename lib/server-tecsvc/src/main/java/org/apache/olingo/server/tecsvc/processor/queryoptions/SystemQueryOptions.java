/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.server.tecsvc.processor.queryoptions;

import org.apache.olingo.commons.api.data.EntitySet;
import org.apache.olingo.commons.api.edm.EdmEntitySet;
import org.apache.olingo.server.api.ODataApplicationException;
import org.apache.olingo.server.api.uri.UriInfo;
import org.apache.olingo.server.tecsvc.processor.queryoptions.options.CountHandler;
import org.apache.olingo.server.tecsvc.processor.queryoptions.options.FilterHandler;
import org.apache.olingo.server.tecsvc.processor.queryoptions.options.OrderByHandler;
import org.apache.olingo.server.tecsvc.processor.queryoptions.options.SkipHandler;
import org.apache.olingo.server.tecsvc.processor.queryoptions.options.TopHandler;

public class SystemQueryOptions {
  public static void applySystemQueryOptions(final EntitySet entitySet, final EdmEntitySet edmEntitySet,
      final UriInfo uriInfo) throws ODataApplicationException {
    
    FilterHandler.applyFilterSystemQuery(uriInfo.getFilterOption(), entitySet, edmEntitySet);
    CountHandler.applyCountSystemQueryOption(uriInfo.getCountOption(), entitySet);
    OrderByHandler.applyOrderByOption(uriInfo.getOrderByOption(), entitySet, edmEntitySet);
    SkipHandler.applySkipSystemQueryHandler(uriInfo.getSkipOption(), entitySet);
    TopHandler.applyTopSystemQueryOption(uriInfo.getTopOption(), entitySet);
  }
}
