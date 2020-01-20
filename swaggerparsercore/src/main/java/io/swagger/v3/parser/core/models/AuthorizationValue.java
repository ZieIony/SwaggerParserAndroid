package io.swagger.v3.parser.core.models;

import java.net.URL;
import java.util.Objects;
import java.util.function.Predicate;


public class AuthorizationValue {
    private String value, type, keyName;
    private Predicate<URL> urlMatcher;

    public AuthorizationValue() {
    }

    public AuthorizationValue(String keyName, String value, String type, Predicate<URL> urlMatcher) {
        this.setKeyName(keyName);
        this.setValue(value);
        this.setType(type);
        this.setUrlMatcher(urlMatcher);
    }

    public AuthorizationValue(String keyName, String value, String type) {
        this(keyName, value, type, url -> true);
    }

    public AuthorizationValue value(String value) {
        this.value = value;
        return this;
    }

    public AuthorizationValue type(String type) {
        this.type = type;
        return this;
    }

    public AuthorizationValue keyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    public AuthorizationValue urlMatcher(Predicate<URL> urlMatcher) {
        setUrlMatcher(urlMatcher);
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Predicate<URL> getUrlMatcher() {
        return urlMatcher;
    }

    public void setUrlMatcher(Predicate<URL> urlMatcher) {
        this.urlMatcher = Objects.requireNonNull(urlMatcher);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((keyName == null) ? 0 : keyName.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + urlMatcher.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AuthorizationValue other = (AuthorizationValue) obj;
        if (keyName == null) {
            if (other.keyName != null) {
                return false;
            }
        } else if (!keyName.equals(other.keyName)) {
            return false;
        }
        if (type == null) {
            if (other.type != null) {
                return false;
            }
        } else if (!type.equals(other.type)) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        if (!urlMatcher.equals(other.urlMatcher)) {
            return false;
        }
        return true;
    }
}