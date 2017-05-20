/*
 * Copyright 2012-2013 TopCoder, Inc.
 *
 * This code was developed under U.S. government contract NNH10CD71C.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.medicaid.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Represents an agreement document.
 *
 * @author TCSASSEMBLER
 * @version 1.0
 */
@javax.persistence.Entity
@Table(name = "agreement_documents")
public class AgreementDocument {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(name = "agreement_document_id")
    private long id;

    @Column(name = "document_type")
    private String type;

    private String title;

    /**
     * Revision number.
     */
    private int version;

    /**
     * Document data.
     */
    @Lob
    @Column(name = "document_text")
    private String text;

    @ManyToOne(targetEntity = CMSUser.class)
    @JoinColumn(
            name = "created_by"
    )
    private String createdBy;

    /**
     * Timestamp.
     */
    @Column(name = "created_on")
    private Date createdOn;

    /**
     * Empty constructor.
     */
    public AgreementDocument() {
    }

    /**
     * Gets the value of the field <code>title</code>.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the field <code>title</code>.
     *
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the value of the field <code>version</code>.
     *
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the field <code>version</code>.
     *
     * @param version the version to set
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * Gets the value of the field <code>text</code>.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the field <code>text</code>.
     *
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Gets the value of the field <code>createdBy</code>.
     *
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the field <code>createdBy</code>.
     *
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the value of the field <code>createdOn</code>.
     *
     * @return the createdOn
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the field <code>createdOn</code>.
     *
     * @param createdOn the createdOn to set
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Gets the value of the field <code>type</code>.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the field <code>type</code>.
     *
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
    	if (obj instanceof AgreementDocument) {
    		return ((AgreementDocument)obj).getId() == this.getId();
    	}
    	return false;
    }

    @Override
    public int hashCode() {
    	return (int) this.getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
