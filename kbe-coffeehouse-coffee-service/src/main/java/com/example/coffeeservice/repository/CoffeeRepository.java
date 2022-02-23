/*
 *  Copyright 2019 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.example.coffeeservice.repository;

import com.example.coffeeservice.entity.Coffee;
import com.example.coffeeservice.model.CoffeeStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, UUID> {
    
    Page<Coffee> findAllByCoffeeName(String coffeeName, Pageable pageable);

    Page<Coffee> findAllByCoffeeStyle(CoffeeStyleEnum coffeeStyle, Pageable pageable);

    Page<Coffee> findAllByCoffeeNameAndCoffeeStyle(String coffeeName, CoffeeStyleEnum coffeeStyle, Pageable pageable);

    Coffee findByUpc(String upc);
}
