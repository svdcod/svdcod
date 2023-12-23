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

package Spring_boot_web.I_dont_know.error.model;

/**
 * Field error message. Usually represents an error when validation a single field from an object. The validation
 * process may generate several of these.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 *
 */
public interface FieldError extends Error {

    /**
     * Creates a {@code FieldValidationError} for the received arguments.
     *
     * @param message
     *            error message
     * @param object
     *            name of the validated object
     * @param field
     *            name of the validated field
     * @param value
     *            field value during the validation process
     * @return {@code FieldValidationError} for the received arguments
     */
    public static FieldError of(final String message, final String object, final String field, final Object value) {
        final DtoFieldError error;

        error = new DtoFieldError();
        error.setMessage(message);
        error.setObject(object);
        error.setField(field);
        error.setValue(value);

        return error;
    }

    /**
     * Returns the name of the field which failed the validation.
     *
     * @return the name of the field which failed the validation
     */
    public String getField();

    /**
     * Returns the name of the object which failed the validation.
     *
     * @return the name of the object which failed the validation
     */
    public String getObject();

    /**
     * Returns the value of the field which failed the validation.
     *
     * @return the value of the field which failed the validation
     */
    public Object getValue();

}
