package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynValueBox.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u141/9370/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Wednesday, July 12, 2017 4:22:36 AM PDT
*/


/**
    * DynValueBox objects support the manipulation of IDL boxed value types.
    * The DynValueBox interface can represent both null and non-null value types.
    * For a DynValueBox representing a non-null value type, the DynValueBox has a single component
    * of the boxed type. A DynValueBox representing a null value type has no components
    * and a current position of -1.
    */
public interface DynValueBox extends DynValueBoxOperations, org.omg.DynamicAny.DynValueCommon, org.omg.CORBA.portable.IDLEntity 
{
} // interface DynValueBox
