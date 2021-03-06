/*
 * Copyright (c) 2016 Nike, Inc.
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

package com.nike.vault.client.model;

import java.util.List;

/**
 * Represents an initialization response from Vault
 */
public class VaultInitResponse {

    private List<String> keys;

    private String rootToken;

    public List<String> getKeys() {
        return keys;
    }

    public VaultInitResponse setKeys(List<String> keys) {
        this.keys = keys;
        return this;
    }

    public String getRootToken() {
        return rootToken;
    }

    public VaultInitResponse setRootToken(String rootToken) {
        this.rootToken = rootToken;
        return this;
    }
}
