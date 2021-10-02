package com.atlassian.jira.cloud.jenkins.buildinfo.client.model;

import com.atlassian.jira.cloud.jenkins.common.model.ApiErrorResponse;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Any builds that were rejected when submitting to the API. Includes the key of the build and the
 * reasons for rejection
 */
public class RejectedBuildResponse {
    private BuildKeyResponse key;
    private List<ApiErrorResponse> errors;

    @JsonCreator
    public RejectedBuildResponse(
            @JsonProperty("key") final BuildKeyResponse key,
            @JsonProperty("errors") final List<ApiErrorResponse> errors) {
        this.key = requireNonNull(key);
        this.errors = ImmutableList.copyOf(errors);
    }

    public BuildKeyResponse getKey() {
        return key;
    }

    public List<ApiErrorResponse> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "RejectedBuildResponse{" + "key=" + key + ", errors=" + errors + '}';
    }
}
