package com.atlassian.jira.cloud.jenkins.buildinfo.client.model;

/**
 * Represents the commit and the repository it is present in.
 * This is included as part of a build.
 */
public class Reference {
    private Commit commit;
    private Reference ref;

    public Commit getCommit() {
        return commit;
    }

    public Reference getRef() {
        return ref;
    }

    public Reference setCommit(final Commit commit) {
        this.commit = commit;
        return this;
    }

    public Reference setRef(final Reference ref) {
        this.ref = ref;
        return this;
    }
}
