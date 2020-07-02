/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/* Anagram Game Application */

package com.toy.anagrams.lib;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public final class FileWordLibrary extends WordLibrary {
    private final List<String> wordList;

    public FileWordLibrary() throws IOException {
        wordList = Files.readAllLines(new File("words.txt").toPath(), Charset.defaultCharset());
    }

    public String getWord(int idx) {
        return wordList.get(idx);
    }

    public String getScrambledWord(int idx) {
        return getWord(idx);
    }

    public int getSize() {
        return wordList.size();
    }

    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }
}
