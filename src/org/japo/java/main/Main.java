/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes
        final char LETRA_INI = 'A';
        final char LETRA_FIN = 'Z';

        //Variable generando datos
        char letra
                = (char) (RND.nextInt(LETRA_FIN - LETRA_INI + 1) + LETRA_INI);

        //Salida por consola
        System.out.println("Letra de inicio de examen...: " + letra);
    }
}
