/* Copyright 2013, Big Switch Networks, Inc.
 *
 * LoxiGen is licensed under the Eclipse Public License, version 1.0 (EPL), with
 * the following special exception:
 *
 * LOXI Exception
 *
 * As a special exception to the terms of the EPL, you may distribute libraries
 * generated by LoxiGen (LoxiGen Libraries) under the terms of your choice, provided
 * that copyright and licensing notices generated by LoxiGen are not altered or removed
 * from the LoxiGen Libraries and the notice provided below is (i) included in
 * the LoxiGen Libraries, if distributed in source code form and (ii) included in any
 * documentation for the LoxiGen Libraries, if distributed in binary form.
 *
 * Notice: "Copyright 2013, Big Switch Networks, Inc. This library was generated by the LoxiGen Compiler."
 *
 * You may not use this file except in compliance with the EPL or LOXI Exception. You may obtain
 * a copy of the EPL at:
 *
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * EPL for the specific language governing permissions and limitations
 * under the EPL.
 */
package org.openflow.protocol;

/**
 * The base interface for all OpenFlow message objects
 */

import org.openflow.types.OFType;

abstract public class OFAbstractMessage implements OFObject {
    private final OFVersion version;
    private final OFType type;
    private int xid;

    public static int MINIMUM_SIZE = 8;

    public OFAbstractMessage(final OFVersion version, final OFType type) {
        this.version = version;
        this.type = type;
    }

    /**
     * Return the wire format version of this message, e.g., 0x01
     */
    OFVersion getVersion() {
        return version;
    }

    /**
     * @return the transction ID for this message
     */
    int getXid() {
        return xid;
    }

    /**
     * @param newXid
     *            Set this transaction ID for this message
     */
    void setXid(final int xid) {
        this.xid = xid;
    }

    /**
     * The type that is returned here is agnostic to the underlying wire format
     *
     * @return the type of OpenFlow message.
     */
    OFType getType() {
        return type;
    }

    @Override
    public int getLength() {
        return MINIMUM_SIZE;
    }
}
