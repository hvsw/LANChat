/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Objects;

/**
 *
 * @author henriquevalcanaia
 */
public class User {
    private String nickName;
    private String ipAddress;
    private String machineName;

    public User() {
    }

    
    public User(String nickName, String ipAddress, String machineName) {
        this.nickName = nickName;
        this.ipAddress = ipAddress;
        this.machineName = machineName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nickName);
        hash = 37 * hash + Objects.hashCode(this.ipAddress);
        hash = 37 * hash + Objects.hashCode(this.machineName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.nickName, other.nickName)) {
            return false;
        }
        if (!Objects.equals(this.ipAddress, other.ipAddress)) {
            return false;
        }
        if (!Objects.equals(this.machineName, other.machineName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "nickName=" + nickName + ", ipAddress=" + ipAddress + ", machineName=" + machineName + '}';
    }
}
