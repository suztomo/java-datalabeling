// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface ListAnnotatedDatasetsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the dataset to list annotated datasets, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Name of the dataset to list annotated datasets, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Filter is not supported at this moment.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filter is not supported at this moment.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Requested page size. Server may return fewer results than
   * requested. Default value is 100.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by
   * [ListAnnotatedDatasetsResponse.next_page_token][google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse.next_page_token]
   * of the previous [DataLabelingService.ListAnnotatedDatasets] call. Return
   * first page if empty.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by
   * [ListAnnotatedDatasetsResponse.next_page_token][google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse.next_page_token]
   * of the previous [DataLabelingService.ListAnnotatedDatasets] call. Return
   * first page if empty.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
