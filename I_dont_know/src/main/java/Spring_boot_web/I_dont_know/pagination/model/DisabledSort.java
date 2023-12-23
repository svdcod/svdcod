/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2023 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package Spring_boot_web.I_dont_know.pagination.model;

import lombok.Data;

/**
 * Disabled sorted data request. This serves as a null object to disable sorting.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 *
 */
@Data
public final class DisabledSort implements Sort {

    /**
     * Singleton for disabled sort.
     */
    public static final Sort INSTANCE  = new DisabledSort();

    /**
     * Default direction.
     */
    private final Direction  direction = Direction.ASC;

    /**
     * Default property.
     */
    private final String     property  = "";

    /**
     * Disabled sort flag.
     */
    private final Boolean    sorted    = false;

}
