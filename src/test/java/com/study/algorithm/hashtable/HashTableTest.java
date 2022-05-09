package com.study.algorithm.hashtable;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HashTableTest {

    @Test
    @DisplayName("HashTable 검중")
    void hashTableTest() {
        //given
        HashTable hashTable = new HashTable(3);

        //when
        hashTable.put("jun", "He is handsome");
        hashTable.put("joo", "He is awsome");
        hashTable.put("he", "He is lucky");
        hashTable.put("ho", "He is goodman");

        //then
        assertThat(hashTable.get("jun")).isEqualTo("He is handsome");
    }

    @Test
    @DisplayName("HashTable Overwrite검중")
    void hashTableOverwriteTest() {
        //given
        HashTable hashTable = new HashTable(3);

        //when
        hashTable.put("jun", "He is handsome");
        hashTable.put("joo", "He is awsome");
        hashTable.put("he", "He is lucky");
        hashTable.put("ho", "He is goodman");
        hashTable.put("jun", "He is angry");

        //then
        assertThat(hashTable.get("jun")).isEqualTo("He is angry");
    }
}