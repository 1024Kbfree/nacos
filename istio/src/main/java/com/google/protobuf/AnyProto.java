// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/any.proto

package com.google.protobuf;

public final class AnyProto {
  private AnyProto() {}
  public static void registerAllExtensions(
      ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      ExtensionRegistry registry) {
    registerAllExtensions(
        (ExtensionRegistryLite) registry);
  }
  static final Descriptors.Descriptor
    internal_static_google_protobuf_Any_descriptor;
  static final
    GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Any_fieldAccessorTable;

  public static Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\031google/protobuf/any.proto\022\017google.prot" +
      "obuf\"&\n\003Any\022\020\n\010type_url\030\001 \001(\t\022\r\n\005value\030\002" +
      " \001(\014Bo\n\023com.google.protobufB\010AnyProtoP\001Z" +
      "%github.com/golang/protobuf/ptypes/any\242\002" +
      "\003GPB\252\002\036Google.Protobuf.WellKnownTypesb\006p" +
      "roto3"
    };
    descriptor = Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new Descriptors.FileDescriptor[] {
        });
    internal_static_google_protobuf_Any_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_Any_fieldAccessorTable = new
      GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Any_descriptor,
        new String[] { "TypeUrl", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
