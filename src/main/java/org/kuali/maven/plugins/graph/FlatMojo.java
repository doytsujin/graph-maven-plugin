/**
 * Copyright 2010-2011 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/ecl2.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.maven.plugins.graph;

import java.io.File;

import org.kuali.maven.plugins.graph.dot.edge.EdgeHandler;
import org.kuali.maven.plugins.graph.dot.edge.FlatEdgeHandler;

/**
 * <p>
 * This mojo lays out the dependency graph in the same order they are defined in the pom's.
 * </p>
 *
 * This style can make it easier to comprehend the tree but the graph will have more nodes on it.
 *
 * @goal flat
 * @requiresDependencyResolution compile|test|runtime
 */
public class FlatMojo extends BaseMojo {

    /**
     * The file the graph will be written to
     *
     * @parameter expression="${graph.file}" default-value="${project.build.directory}/graph/flat.png"
     */
    private File file;

    @Override
    protected EdgeHandler getEdgeHandler() {
        return new FlatEdgeHandler();
    }

    @Override
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}