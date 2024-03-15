/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2024 Hitachi Vantara. All rights reserved.
 */

package org.pentaho.platform.api.genericfile.exception;

/**
 * The exception class thrown when the user of the current session does not have permission to perform an
 * operation of the {@link org.pentaho.platform.api.genericfile.IGenericFileService IGenericFileService interface}.
 */
public class AccessControlException extends OperationFailedException {

  public AccessControlException() {
    super();
  }

  public AccessControlException( String message ) {
    super( message );
  }

  public AccessControlException( Throwable cause ) {
    super( cause );
  }
}
