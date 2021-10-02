package com.atlassian.jira.cloud.jenkins.buildinfo.client.model;

/**
 * Commit represents the changes contained in the build
 */
public class Commit {
    private String id;
    private String repositoryUri;

    public String getId() {
        return id;
    }

    public String getRepositoryUri() {
        return repositoryUri;
    }

    public Commit setRepositoryUri(final String repositoryUri) {
        this.repositoryUri = repositoryUri;
        return this;
    }

    public Commit setId(final String id) {
        this.id = id;
        return this;
    }
}
