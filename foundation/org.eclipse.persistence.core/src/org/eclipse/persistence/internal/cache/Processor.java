/*
 * Copyright (c) 2015, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//      Marcel Valovy - initial API and implementation
package org.eclipse.persistence.internal.cache;

/**
 * Processor for computable tasks.
 */
public interface Processor {

    /**
     * Waits if necessary for the computation to complete, and then
     * retrieves its result.
     *
     * @param taskArg argument for computation
     */
    <A, V> V compute(ComputableTask<A, V> task, A taskArg);

}
