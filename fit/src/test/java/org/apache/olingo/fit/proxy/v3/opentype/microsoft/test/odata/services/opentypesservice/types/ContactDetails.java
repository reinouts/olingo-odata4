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

package org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservice.types;

import org.apache.olingo.ext.proxy.api.annotations.Namespace;
import org.apache.olingo.ext.proxy.api.annotations.ComplexType;
import org.apache.olingo.ext.proxy.api.annotations.Property;
import org.apache.olingo.ext.proxy.api.annotations.NavigationProperty;
import org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservice.*;
import org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservice.types.*;

import org.apache.olingo.commons.api.edm.geo.Geospatial;
import org.apache.olingo.commons.api.edm.geo.GeospatialCollection;
import org.apache.olingo.commons.api.edm.geo.LineString;
import org.apache.olingo.commons.api.edm.geo.MultiLineString;
import org.apache.olingo.commons.api.edm.geo.MultiPoint;
import org.apache.olingo.commons.api.edm.geo.MultiPolygon;
import org.apache.olingo.commons.api.edm.geo.Point;
import org.apache.olingo.commons.api.edm.geo.Polygon;
import java.math.BigDecimal;
import java.net.URI;
import java.util.UUID;
import java.io.Serializable;
import java.util.Collection;
import java.util.Calendar;
import javax.xml.datatype.Duration;


@Namespace("Microsoft.Test.OData.Services.OpenTypesService")
@ComplexType(name = "ContactDetails")
public interface ContactDetails 
    extends Serializable {


    @Property(name = "FirstContacted", type = "Edm.Binary", nullable = true)
    byte[] getFirstContacted();

    void setFirstContacted(final byte[] _firstContacted);

    

    @Property(name = "LastContacted", type = "Edm.DateTimeOffset", nullable = false)
    Calendar getLastContacted();

    void setLastContacted(final Calendar _lastContacted);

    

    @Property(name = "Contacted", type = "Edm.DateTime", nullable = false)
    Calendar getContacted();

    void setContacted(final Calendar _contacted);

    

    @Property(name = "GUID", type = "Edm.Guid", nullable = false)
    UUID getGUID();

    void setGUID(final UUID _gUID);

    

    @Property(name = "PreferedContactTime", type = "Edm.Time", nullable = false)
    BigDecimal getPreferedContactTime();

    void setPreferedContactTime(final BigDecimal _preferedContactTime);

    

    @Property(name = "Byte", type = "Edm.Byte", nullable = false)
    Short getByte();

    void setByte(final Short _byte);

    

    @Property(name = "SignedByte", type = "Edm.SByte", nullable = false)
    Byte getSignedByte();

    void setSignedByte(final Byte _signedByte);

    

    @Property(name = "Double", type = "Edm.Double", nullable = false)
    Double getDouble();

    void setDouble(final Double _double);

    

    @Property(name = "Single", type = "Edm.Single", nullable = false)
    Float getSingle();

    void setSingle(final Float _single);

    

    @Property(name = "Short", type = "Edm.Int16", nullable = false)
    Short getShort();

    void setShort(final Short _short);

    

    @Property(name = "Int", type = "Edm.Int32", nullable = false)
    Integer getInt();

    void setInt(final Integer _int);

    

    @Property(name = "Long", type = "Edm.Int64", nullable = false)
    Long getLong();

    void setLong(final Long _long);

    

}