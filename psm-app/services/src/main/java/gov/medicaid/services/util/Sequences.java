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
package gov.medicaid.services.util;

/**
 * List of used sequence names for this application.
 *
 * @author TCSASSEMBLER
 * @version 1.0
 */
public class Sequences {

    /**
     * Used for attachments table.
     */
    public static final String ATTACHMENT_SEQ = "ATTACHMENT_SEQ";

    /**
     * Used for tickets table.
     */
    public static final String TICKET_SEQ = "TICKET_SEQ";

    /**
     * Used for each new provider enrollment.
     */
    public static final String PROVIDER_NUMBER_SEQ = "PROVIDER_NUMBER_SEQ";

    /**
     * Used for each user.
     */
    public static final String USER_ID = "CMS_USER_SEQ";

    /**
     * Private constructor.
     */
    private Sequences() {
    }
}
