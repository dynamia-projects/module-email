/*
 * Copyright (C)  2020. Dynamia Soluciones IT S.A.S - NIT 900302344-1 All Rights Reserved.
 * Colombia - South America
 *
 * This file is free software: you can redistribute it and/or modify it  under the terms of the
 *  GNU Lesser General Public License (LGPL v3) as published by the Free Software Foundation,
 *   either version 3 of the License, or (at your option) any later version.
 *
 *  This file is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *   without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *   See the GNU Lesser General Public License for more details. You should have received a copy of the
 *   GNU Lesser General Public License along with this file.
 *   If not, see <https://www.gnu.org/licenses/>.
 *
 */

package tools.dynamia.modules.email;

import tools.dynamia.domain.contraints.NotEmpty;

import javax.validation.constraints.Max;
import java.io.Serializable;

/**
 * Basic SMS message wrapper
 */
public class SMSMessage implements Serializable {

    @NotEmpty(message = "Phone number is required")
    private String phoneNumber;
    @NotEmpty(message = "Text message is required")
    private String text;
    private String senderID;
    private boolean transactional;
    @NotEmpty(message = "SMS credentials are required")
    private String username;
    @NotEmpty(message = "SMS credentials are required")
    private String password;
    private String region = "us-east-1";
    private Long accountId;
    private String result;
    private boolean sended;

    public SMSMessage() {
    }

    /**
     * Create a sms message with number and text message
     *
     * @param phoneNumber
     * @param text
     */
    public SMSMessage(String phoneNumber, String text) {
        this.phoneNumber = phoneNumber;
        this.text = text;
    }

    /***
     * Create sms message with number, text and sender ID
     * @param phoneNumber
     * @param text
     * @param senderID
     */
    public SMSMessage(String phoneNumber, String text, String senderID) {
        this.phoneNumber = phoneNumber;
        this.text = text;
        this.senderID = senderID;
    }

    /**
     * Create a SMS message with number, text, senderID and mark if transactional
     *
     * @param phoneNumber
     * @param text
     * @param senderID
     * @param transactional
     */
    public SMSMessage(String phoneNumber, String text, String senderID, boolean transactional) {
        this.phoneNumber = phoneNumber;
        this.text = text;
        this.senderID = senderID;
        this.transactional = transactional;
    }

    public void setCredentials(String username, String password, String region) {
        this.username = username;
        this.password = password;
        if (region != null && !region.isEmpty()) {
            this.region = region;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRegion() {
        return region;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public boolean isTransactional() {
        return transactional;
    }

    public void setTransactional(boolean transactional) {
        this.transactional = transactional;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setSended(boolean sended) {
        this.sended = sended;
    }

    public boolean isSended() {
        return sended;
    }
}
