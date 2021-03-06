// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/discovery.proto

package io.grpc.xds.shaded.envoy.api.v2;

public final class Discovery {
  private Discovery() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_DiscoveryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_DiscoveryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_DiscoveryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_DiscoveryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_IncrementalDiscoveryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_IncrementalDiscoveryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_IncrementalDiscoveryRequest_InitialResourceVersionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_IncrementalDiscoveryRequest_InitialResourceVersionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_IncrementalDiscoveryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_IncrementalDiscoveryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034envoy/api/v2/discovery.proto\022\014envoy.ap" +
      "i.v2\032\034envoy/api/v2/core/base.proto\032\031goog" +
      "le/protobuf/any.proto\032\027google/rpc/status" +
      ".proto\"\273\001\n\020DiscoveryRequest\022\024\n\014version_i" +
      "nfo\030\001 \001(\t\022%\n\004node\030\002 \001(\0132\027.envoy.api.v2.c" +
      "ore.Node\022\026\n\016resource_names\030\003 \003(\t\022\020\n\010type" +
      "_url\030\004 \001(\t\022\026\n\016response_nonce\030\005 \001(\t\022(\n\014er" +
      "ror_detail\030\006 \001(\0132\022.google.rpc.Status\"\203\001\n" +
      "\021DiscoveryResponse\022\024\n\014version_info\030\001 \001(\t" +
      "\022\'\n\tresources\030\002 \003(\0132\024.google.protobuf.An" +
      "y\022\016\n\006canary\030\003 \001(\010\022\020\n\010type_url\030\004 \001(\t\022\r\n\005n" +
      "once\030\005 \001(\t\"\211\003\n\033IncrementalDiscoveryReque" +
      "st\022%\n\004node\030\001 \001(\0132\027.envoy.api.v2.core.Nod" +
      "e\022\020\n\010type_url\030\002 \001(\t\022 \n\030resource_names_su" +
      "bscribe\030\003 \003(\t\022\"\n\032resource_names_unsubscr" +
      "ibe\030\004 \003(\t\022i\n\031initial_resource_versions\030\005" +
      " \003(\0132F.envoy.api.v2.IncrementalDiscovery" +
      "Request.InitialResourceVersionsEntry\022\026\n\016" +
      "response_nonce\030\006 \001(\t\022(\n\014error_detail\030\007 \001" +
      "(\0132\022.google.rpc.Status\032>\n\034InitialResourc" +
      "eVersionsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001" +
      "(\t:\0028\001\"\220\001\n\034IncrementalDiscoveryResponse\022" +
      "\033\n\023system_version_info\030\001 \001(\t\022)\n\tresource" +
      "s\030\002 \003(\0132\026.envoy.api.v2.Resource\022\031\n\021remov" +
      "ed_resources\030\006 \003(\t\022\r\n\005nonce\030\005 \001(\t\"C\n\010Res" +
      "ource\022\017\n\007version\030\001 \001(\t\022&\n\010resource\030\002 \001(\013" +
      "2\024.google.protobuf.AnyB\'\n\037io.grpc.xds.sh" +
      "aded.envoy.api.v2P\001Z\002v2b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grpc.xds.shaded.envoy.api.v2.core.Base.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_envoy_api_v2_DiscoveryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_DiscoveryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_DiscoveryRequest_descriptor,
        new java.lang.String[] { "VersionInfo", "Node", "ResourceNames", "TypeUrl", "ResponseNonce", "ErrorDetail", });
    internal_static_envoy_api_v2_DiscoveryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_api_v2_DiscoveryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_DiscoveryResponse_descriptor,
        new java.lang.String[] { "VersionInfo", "Resources", "Canary", "TypeUrl", "Nonce", });
    internal_static_envoy_api_v2_IncrementalDiscoveryRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_api_v2_IncrementalDiscoveryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_IncrementalDiscoveryRequest_descriptor,
        new java.lang.String[] { "Node", "TypeUrl", "ResourceNamesSubscribe", "ResourceNamesUnsubscribe", "InitialResourceVersions", "ResponseNonce", "ErrorDetail", });
    internal_static_envoy_api_v2_IncrementalDiscoveryRequest_InitialResourceVersionsEntry_descriptor =
      internal_static_envoy_api_v2_IncrementalDiscoveryRequest_descriptor.getNestedTypes().get(0);
    internal_static_envoy_api_v2_IncrementalDiscoveryRequest_InitialResourceVersionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_IncrementalDiscoveryRequest_InitialResourceVersionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_api_v2_IncrementalDiscoveryResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_api_v2_IncrementalDiscoveryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_IncrementalDiscoveryResponse_descriptor,
        new java.lang.String[] { "SystemVersionInfo", "Resources", "RemovedResources", "Nonce", });
    internal_static_envoy_api_v2_Resource_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_api_v2_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_Resource_descriptor,
        new java.lang.String[] { "Version", "Resource", });
    io.grpc.xds.shaded.envoy.api.v2.core.Base.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
