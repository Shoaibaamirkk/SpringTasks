/**
 * Copyright (c) by FWU Group - All rights reserved
 * <p>
 * NOTICE:  All information contained herein is, and remains the property of
 * FWU Group and its suppliers, if any. The intellectual and technical concepts
 * contained herein are confidential and proprietary to FWU Group and its suppliers
 * and may be covered by patents, patents in process, and are protected by trade secret
 * or copyright law.
 * <p>
 * Dissemination of this information or reproduction of this material is strictly
 * forbidden unless prior written permission is obtained from FWU Group.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 */
public class CollectionAddress {

    private String city = "";
    private String state = "";
    private String country = "";

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
