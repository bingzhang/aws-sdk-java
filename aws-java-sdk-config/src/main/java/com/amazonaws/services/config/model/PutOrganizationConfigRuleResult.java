/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConfigRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutOrganizationConfigRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String organizationConfigRuleArn;

    /**
     * @param organizationConfigRuleArn
     */

    public void setOrganizationConfigRuleArn(String organizationConfigRuleArn) {
        this.organizationConfigRuleArn = organizationConfigRuleArn;
    }

    /**
     * @return
     */

    public String getOrganizationConfigRuleArn() {
        return this.organizationConfigRuleArn;
    }

    /**
     * @param organizationConfigRuleArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOrganizationConfigRuleResult withOrganizationConfigRuleArn(String organizationConfigRuleArn) {
        setOrganizationConfigRuleArn(organizationConfigRuleArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOrganizationConfigRuleArn() != null)
            sb.append("OrganizationConfigRuleArn: ").append(getOrganizationConfigRuleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutOrganizationConfigRuleResult == false)
            return false;
        PutOrganizationConfigRuleResult other = (PutOrganizationConfigRuleResult) obj;
        if (other.getOrganizationConfigRuleArn() == null ^ this.getOrganizationConfigRuleArn() == null)
            return false;
        if (other.getOrganizationConfigRuleArn() != null && other.getOrganizationConfigRuleArn().equals(this.getOrganizationConfigRuleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationConfigRuleArn() == null) ? 0 : getOrganizationConfigRuleArn().hashCode());
        return hashCode;
    }

    @Override
    public PutOrganizationConfigRuleResult clone() {
        try {
            return (PutOrganizationConfigRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
