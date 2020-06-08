/*
 * Рассмотрим пять шаголв для создания 
 * параметризированных тестов
 *
 */
package com.ivantsov.junit.lesson5;

import java.util.Collection;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/* Шаг № 1
 * Аннотировать параметризуемый класс с
 * помощью @RunWith (Parameterized.class)
 */
@RunWith(Parameterized.class)
public class PrimeNomberCheckerTest {
    
    /* Шаг № 3
     * Создайте переменную экземпляра для каждого "столбца"
     * тестовых данных
     */
    private int inputValue;
    private boolean resultValue;
    // Создаем поле нашего класса которое мы будем тестировать
    private PrimeNumberChecker primeNumberChecker;
    
    /* Шаг № 4
     * Создать открытый котструктор, который принимает то, что
     * эквивалентно одной строке тестовых данных
     */
    public PrimeNomberCheckerTest(int inputValue, boolean resultValue) {
        this.inputValue = inputValue;
        this.resultValue = resultValue;
    }
    
    /* Инициализируем поле для тестирования в методе, который
     * пометим аннотацией @Before
     */ 
    @Before
    public void init() {
        primeNumberChecker = new PrimeNumberChecker();
    }
    
    /* Шаг № 2
     * Создать открытый статический метод с аннотацией @Parameters,
     * который возвращает коллекцию объектов (как массив) в 
     * качестве набора тестовых данных
     */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
            {2, true}, {6, false}, {19, true}, {22, false}, {23, true}
        });
    }
    
    /* Шаг № 5
     * Создать свои тестовые наборы, используя переменные экземпляра
     * в качестве источник тестовых данныз
     */
    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized nomber is = " + inputValue);
        assertEquals(resultValue, primeNumberChecker.validate(inputValue));
    }
    
}
