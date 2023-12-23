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

package Spring_boot_web.I_dont_know.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Spring_boot_web.I_dont_know.domain.model.ExampleEntity;
import Spring_boot_web.I_dont_know.domain.service.ExampleEntityService;
import Spring_boot_web.I_dont_know.pagination.model.Pagination;
import Spring_boot_web.I_dont_know.pagination.model.Sort;

import lombok.AllArgsConstructor;

/**
 * Rest controller for the example entities.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 */
@RestController
@RequestMapping("/entity")
@AllArgsConstructor
public class ExampleEntityController {

    /**
     * Example entity service.
     */
    private final ExampleEntityService exampleEntityService;

    /**
     * Returns a collection of entities.
     *
     * @param pagination
     *            pagination request
     * @param sort
     *            sorting request
     * @return a collection of entities
     */
    @GetMapping
    public Iterable<? extends ExampleEntity> read(final Pagination pagination, final Sort sort) {
        return exampleEntityService.getAll(pagination, sort);
    }

}
