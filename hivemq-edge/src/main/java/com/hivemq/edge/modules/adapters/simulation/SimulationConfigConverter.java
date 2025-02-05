/*
 * Copyright 2019-present HiveMQ GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hivemq.edge.modules.adapters.simulation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hivemq.edge.modules.config.CustomConfig;
import com.hivemq.extension.sdk.api.annotations.NotNull;

import java.util.Map;

public class SimulationConfigConverter {

    public static @NotNull SimulationAdapterConfig convertConfig(final @NotNull Map<String, Object> config) {
        final ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(config, SimulationAdapterConfig.class);
    }

    public static @NotNull Map<String, Object> unconvertConfig(final @NotNull CustomConfig config) {
        final ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(config, Map.class);
    }
}
