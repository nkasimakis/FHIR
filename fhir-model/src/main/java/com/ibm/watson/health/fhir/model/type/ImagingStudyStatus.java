/*
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watson.health.fhir.model.type;

import java.util.Collection;
import java.util.Objects;

public class ImagingStudyStatus extends Code {
    /**
     * Registered
     */
    public static final ImagingStudyStatus REGISTERED = ImagingStudyStatus.of(ValueSet.REGISTERED);

    /**
     * Available
     */
    public static final ImagingStudyStatus AVAILABLE = ImagingStudyStatus.of(ValueSet.AVAILABLE);

    /**
     * Cancelled
     */
    public static final ImagingStudyStatus CANCELLED = ImagingStudyStatus.of(ValueSet.CANCELLED);

    /**
     * Entered in Error
     */
    public static final ImagingStudyStatus ENTERED_IN_ERROR = ImagingStudyStatus.of(ValueSet.ENTERED_IN_ERROR);

    /**
     * Unknown
     */
    public static final ImagingStudyStatus UNKNOWN = ImagingStudyStatus.of(ValueSet.UNKNOWN);

    private volatile int hashCode;

    private ImagingStudyStatus(Builder builder) {
        super(builder);
    }

    public static ImagingStudyStatus of(java.lang.String value) {
        return ImagingStudyStatus.builder().value(value).build();
    }

    public static ImagingStudyStatus of(ValueSet value) {
        return ImagingStudyStatus.builder().value(value).build();
    }

    public static String string(java.lang.String value) {
        return ImagingStudyStatus.builder().value(value).build();
    }

    public static Code code(java.lang.String value) {
        return ImagingStudyStatus.builder().value(value).build();
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
        ImagingStudyStatus other = (ImagingStudyStatus) obj;
        return Objects.equals(id, other.id) && Objects.equals(extension, other.extension) && Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(id, extension, value);
            hashCode = result;
        }
        return result;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = id;
        builder.extension.addAll(extension);
        builder.value = value;
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (Builder) super.value(ValueSet.from(value).value());
        }

        public Builder value(ValueSet value) {
            return (Builder) super.value(value.value());
        }

        @Override
        public ImagingStudyStatus build() {
            return new ImagingStudyStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Registered
         */
        REGISTERED("registered"),

        /**
         * Available
         */
        AVAILABLE("available"),

        /**
         * Cancelled
         */
        CANCELLED("cancelled"),

        /**
         * Entered in Error
         */
        ENTERED_IN_ERROR("entered-in-error"),

        /**
         * Unknown
         */
        UNKNOWN("unknown");

        private final java.lang.String value;

        ValueSet(java.lang.String value) {
            this.value = value;
        }

        public java.lang.String value() {
            return value;
        }

        public static ValueSet from(java.lang.String value) {
            for (ValueSet c : ValueSet.values()) {
                if (c.value.equals(value)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(value);
        }
    }
}
