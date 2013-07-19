/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.plugins.github.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Aleksey Pivovarov
 */
@SuppressWarnings("UnusedDeclaration")
public class GithubRepo {
  private long id;
  @NotNull private String name;
  @NotNull private String fullName;
  @NotNull private String description;

  private boolean isPrivate;
  private boolean isFork;

  @NotNull private String url;
  @NotNull private String htmlUrl;
  @NotNull private String cloneUrl;
  @NotNull private String gitUrl;
  @NotNull private String sshUrl;
  @Nullable private String mirrorUrl;

  private int size;
  @Nullable private String masterBranch;

  @NotNull private GithubUser owner;

  @NotNull
  public static GithubRepo create(@Nullable GithubRepoRaw raw) throws JsonException {
    try {
      if (raw == null) throw new JsonException("raw is null");
      if (raw.id == null) throw new JsonException("id is null");
      if (raw.name == null) throw new JsonException("name is null");
      if (raw.fullName == null) throw new JsonException("fullName is null");
      if (raw.description == null) throw new JsonException("description is null");
      if (raw.isPrivate == null) throw new JsonException("isPrivate is null");
      if (raw.isFork == null) throw new JsonException("isFork is null");
      if (raw.url == null) throw new JsonException("url is null");
      if (raw.htmlUrl == null) throw new JsonException("htmlUrl is null");
      if (raw.cloneUrl == null) throw new JsonException("cloneUrl is null");
      if (raw.gitUrl == null) throw new JsonException("gitUrl is null");
      if (raw.sshUrl == null) throw new JsonException("sshUrl is null");
      if (raw.size == null) throw new JsonException("size is null");
      if (raw.owner == null) throw new JsonException("owner is null");

      GithubUser user = GithubUser.create(raw.owner);

      return new GithubRepo(raw.id, raw.name, raw.fullName, raw.description, raw.isPrivate, raw.isFork, raw.url, raw.htmlUrl, raw.cloneUrl,
                            raw.gitUrl, raw.sshUrl, raw.mirrorUrl, raw.size, raw.masterBranch, user);
    }
    catch (JsonException e) {
      throw new JsonException("GithubRepo parse error", e);
    }
  }

  protected GithubRepo(long id,
                       @NotNull String name,
                       @NotNull String fullName,
                       @NotNull String description,
                       boolean aPrivate,
                       boolean fork,
                       @NotNull String url,
                       @NotNull String htmlUrl,
                       @NotNull String cloneUrl,
                       @NotNull String gitUrl,
                       @NotNull String sshUrl,
                       @Nullable String mirrorUrl,
                       int size,
                       @Nullable String masterBranch,
                       @NotNull GithubUser owner) {
    this.id = id;
    this.name = name;
    this.fullName = fullName;
    this.description = description;
    isPrivate = aPrivate;
    isFork = fork;
    this.url = url;
    this.htmlUrl = htmlUrl;
    this.cloneUrl = cloneUrl;
    this.gitUrl = gitUrl;
    this.sshUrl = sshUrl;
    this.mirrorUrl = mirrorUrl;
    this.size = size;
    this.masterBranch = masterBranch;
    this.owner = owner;
  }

  protected GithubRepo(@NotNull GithubRepo repo) {
    this.id = repo.id;
    this.name = repo.name;
    this.fullName = repo.fullName;
    this.description = repo.description;
    isPrivate = repo.isPrivate;
    isFork = repo.isFork;
    this.url = repo.url;
    this.htmlUrl = repo.htmlUrl;
    this.cloneUrl = repo.cloneUrl;
    this.gitUrl = repo.gitUrl;
    this.sshUrl = repo.sshUrl;
    this.mirrorUrl = repo.mirrorUrl;
    this.size = repo.size;
    this.masterBranch = repo.masterBranch;
    this.owner = repo.owner;
  }

  public long getId() {
    return id;
  }

  @NotNull
  public String getName() {
    return name;
  }

  @NotNull
  public String getFullName() {
    return fullName;
  }

  @NotNull
  public String getDescription() {
    return description;
  }

  public boolean isPrivate() {
    return isPrivate;
  }

  public boolean isFork() {
    return isFork;
  }

  @NotNull
  public String getUrl() {
    return url;
  }

  @NotNull
  public String getHtmlUrl() {
    return htmlUrl;
  }

  @NotNull
  public String getCloneUrl() {
    return cloneUrl;
  }

  @NotNull
  public String getGitUrl() {
    return gitUrl;
  }

  @NotNull
  public String getSshUrl() {
    return sshUrl;
  }

  @Nullable
  public String getMirrorUrl() {
    return mirrorUrl;
  }

  public int getSize() {
    return size;
  }

  @Nullable
  public String getMasterBranch() {
    return masterBranch;
  }

  @NotNull
  public GithubUser getOwner() {
    return owner;
  }
}

