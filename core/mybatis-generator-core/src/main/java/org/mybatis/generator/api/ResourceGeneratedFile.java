/**
 *    Copyright 2006-2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.generator.api;

import java.io.StringWriter;

public class ResourceGeneratedFile extends GeneratedFile{

    private StringWriter stringWriter;
    private String targetPackage;
    private String fileName;
    private boolean directoryType;
    private String fileEncoding = "UTF-8";

    public ResourceGeneratedFile(String targetProject) {
        super(targetProject);
    }

    public StringWriter getStringWriter() {
        return stringWriter;
    }

    public void setStringWriter(StringWriter stringWriter) {
        this.stringWriter = stringWriter;
    }

    public void setTargetPackage(String targetPackage) {
        this.targetPackage = targetPackage;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isDirectoryType() {
        return directoryType;
    }

    public void setDirectoryType(boolean directoryType) {
        this.directoryType = directoryType;
    }

    @Override
    public String getFormattedContent() {
        return stringWriter.toString();
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public String getTargetPackage() {
        return targetPackage;
    }

    @Override
    public boolean isMergeable() {
        return false;
    }

    public String getFileEncoding() {
        return fileEncoding;
    }

    public void setFileEncoding(String fileEncoding) {
        this.fileEncoding = fileEncoding;
    }
}
