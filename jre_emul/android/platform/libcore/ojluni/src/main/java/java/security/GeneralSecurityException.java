/*
 * Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.security;

/**
 * The {@code GeneralSecurityException} class is a generic
 * security exception class that provides type safety for all the
 * security-related exception classes that extend from it.
 *
 * @author Jan Luehe
 * @since 1.2
 */

public class GeneralSecurityException extends Exception {

    @java.io.Serial
    private static final long serialVersionUID = 894798122053539237L;

    /**
     * Constructs a GeneralSecurityException with no detail message.
     */
    public GeneralSecurityException() {
        super();
    }

    /**
     * Constructs a GeneralSecurityException with the specified detail
     * message.
     * A detail message is a String that describes this particular
     * exception.
     *
     * @param msg the detail message.
     */
    public GeneralSecurityException(String msg) {
        super(msg);
    }

    /**
     * Creates a {@code GeneralSecurityException} with the specified
     * detail message and cause.
     *
     * @param message the detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method).
     * @param cause the cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A {@code null} value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     * @since 1.5
     */
    public GeneralSecurityException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a {@code GeneralSecurityException} with the specified cause
     * and a detail message of {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of
     * {@code cause}).
     *
     * @param cause the cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A {@code null} value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     * @since 1.5
     */
    public GeneralSecurityException(Throwable cause) {
        super(cause);
    }
}
