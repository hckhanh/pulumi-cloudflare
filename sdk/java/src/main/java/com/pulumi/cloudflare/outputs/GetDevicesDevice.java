// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDevicesDevice {
    private @Nullable String created;
    private @Nullable Boolean deleted;
    private @Nullable String deviceType;
    private @Nullable String id;
    private @Nullable String ip;
    private @Nullable String key;
    private @Nullable String lastSeen;
    private @Nullable String macAddress;
    private @Nullable String manufacturer;
    private @Nullable String model;
    private @Nullable String name;
    private @Nullable String osDistroName;
    private @Nullable String osDistroRevision;
    private @Nullable String osVersion;
    private @Nullable String revokedAt;
    private @Nullable String serialNumber;
    private @Nullable String updated;
    private @Nullable String userEmail;
    private @Nullable String userId;
    private @Nullable String userName;
    private @Nullable String version;

    private GetDevicesDevice() {}
    public Optional<String> created() {
        return Optional.ofNullable(this.created);
    }
    public Optional<Boolean> deleted() {
        return Optional.ofNullable(this.deleted);
    }
    public Optional<String> deviceType() {
        return Optional.ofNullable(this.deviceType);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> lastSeen() {
        return Optional.ofNullable(this.lastSeen);
    }
    public Optional<String> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }
    public Optional<String> manufacturer() {
        return Optional.ofNullable(this.manufacturer);
    }
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> osDistroName() {
        return Optional.ofNullable(this.osDistroName);
    }
    public Optional<String> osDistroRevision() {
        return Optional.ofNullable(this.osDistroRevision);
    }
    public Optional<String> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }
    public Optional<String> revokedAt() {
        return Optional.ofNullable(this.revokedAt);
    }
    public Optional<String> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }
    public Optional<String> updated() {
        return Optional.ofNullable(this.updated);
    }
    public Optional<String> userEmail() {
        return Optional.ofNullable(this.userEmail);
    }
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String created;
        private @Nullable Boolean deleted;
        private @Nullable String deviceType;
        private @Nullable String id;
        private @Nullable String ip;
        private @Nullable String key;
        private @Nullable String lastSeen;
        private @Nullable String macAddress;
        private @Nullable String manufacturer;
        private @Nullable String model;
        private @Nullable String name;
        private @Nullable String osDistroName;
        private @Nullable String osDistroRevision;
        private @Nullable String osVersion;
        private @Nullable String revokedAt;
        private @Nullable String serialNumber;
        private @Nullable String updated;
        private @Nullable String userEmail;
        private @Nullable String userId;
        private @Nullable String userName;
        private @Nullable String version;
        public Builder() {}
        public Builder(GetDevicesDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.deleted = defaults.deleted;
    	      this.deviceType = defaults.deviceType;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.key = defaults.key;
    	      this.lastSeen = defaults.lastSeen;
    	      this.macAddress = defaults.macAddress;
    	      this.manufacturer = defaults.manufacturer;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.osDistroName = defaults.osDistroName;
    	      this.osDistroRevision = defaults.osDistroRevision;
    	      this.osVersion = defaults.osVersion;
    	      this.revokedAt = defaults.revokedAt;
    	      this.serialNumber = defaults.serialNumber;
    	      this.updated = defaults.updated;
    	      this.userEmail = defaults.userEmail;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder created(@Nullable String created) {
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder deleted(@Nullable Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        @CustomType.Setter
        public Builder deviceType(@Nullable String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder lastSeen(@Nullable String lastSeen) {
            this.lastSeen = lastSeen;
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(@Nullable String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        @CustomType.Setter
        public Builder manufacturer(@Nullable String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        @CustomType.Setter
        public Builder model(@Nullable String model) {
            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder osDistroName(@Nullable String osDistroName) {
            this.osDistroName = osDistroName;
            return this;
        }
        @CustomType.Setter
        public Builder osDistroRevision(@Nullable String osDistroRevision) {
            this.osDistroRevision = osDistroRevision;
            return this;
        }
        @CustomType.Setter
        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        @CustomType.Setter
        public Builder revokedAt(@Nullable String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }
        @CustomType.Setter
        public Builder serialNumber(@Nullable String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        @CustomType.Setter
        public Builder updated(@Nullable String updated) {
            this.updated = updated;
            return this;
        }
        @CustomType.Setter
        public Builder userEmail(@Nullable String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        @CustomType.Setter
        public Builder userId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetDevicesDevice build() {
            final var o = new GetDevicesDevice();
            o.created = created;
            o.deleted = deleted;
            o.deviceType = deviceType;
            o.id = id;
            o.ip = ip;
            o.key = key;
            o.lastSeen = lastSeen;
            o.macAddress = macAddress;
            o.manufacturer = manufacturer;
            o.model = model;
            o.name = name;
            o.osDistroName = osDistroName;
            o.osDistroRevision = osDistroRevision;
            o.osVersion = osVersion;
            o.revokedAt = revokedAt;
            o.serialNumber = serialNumber;
            o.updated = updated;
            o.userEmail = userEmail;
            o.userId = userId;
            o.userName = userName;
            o.version = version;
            return o;
        }
    }
}
