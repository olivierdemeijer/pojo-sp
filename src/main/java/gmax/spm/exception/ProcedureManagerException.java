/**
 * POJO Stored Procedure Entity Manager
 * Copyright (c) 2011-2013 Gmax
 *
 * Author: Marius Gligor <marius.gligor@gmail.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111, USA.
 */
package gmax.spm.exception;

/**
 * ProcedureManagerException used to wrap all "checked" exceptions
 * to an "unchecked" exception.
 *
 * @author Marius Gligor
 * @version 3.0
 */
public class ProcedureManagerException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 7746720446568325686L;

    /**
     * Constructor
     *
     * @param message the text message
     */
    public ProcedureManagerException(String message) {
        super(message);
    }

    /**
     * Constructor
     *
     * @param throwable a Throwable object
     */
    public ProcedureManagerException(Throwable throwable) {
        super(throwable);
    }
}
