package com.atlassian.jira.cloud.jenkins.buildinfo.client.model;

import com.atlassian.jira.cloud.jenkins.common.client.JiraRequest;
import com.atlassian.jira.cloud.jenkins.common.client.model.Properties;
import com.atlassian.jira.cloud.jenkins.common.client.model.ProviderMetadata;

import java.util.Collections;
import java.util.List;

/** This represents the payload for the API request to submit list of builds */
public class Builds implements JiraRequest {
    private List<JiraBuildInfo> builds;
    private Properties properties;
    private ProviderMetadata providerMetadata;

    public Builds(final JiraBuildInfo jiraBuildInfo) {
        this.builds = Collections.singletonList(jiraBuildInfo);
        this.properties = new Properties();
        this.providerMetadata = new ProviderMetadata();
    }

    public List<JiraBuildInfo> getBuilds() {
        return builds;
    }

    public Properties getProperties() {
        return properties;
    }

    public ProviderMetadata getProviderMetadata() {
        return providerMetadata;
    }
}
