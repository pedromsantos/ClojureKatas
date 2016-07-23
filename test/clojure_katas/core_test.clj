(ns clojure-katas.core-test
  (:require [clojure.test :refer :all]
            [clojure-katas.core :refer :all]))

(deftest should-return-one-for-number-1 
  (is (= (fizzBuzz 1) 1))
)

(deftest should-return-two-for-number-2 
  (is (= (fizzBuzz 2) 2))
)

(deftest should-return-fizz-for-number-3 
  (is (= (fizzBuzz 3) "fizz"))
)

(deftest should-return-fizz-for-number-6 
  (is (= (fizzBuzz 6) "fizz"))
)

(deftest should-return-fizz-for-number-9 
  (is (= (fizzBuzz 9) "fizz"))
)

(deftest should-return-buzz-for-number-5 
  (is (= (fizzBuzz 5) "buzz"))
)

(deftest should-return-buzz-for-number-10 
  (is (= (fizzBuzz 10) "buzz"))
)

(deftest should-return-buzz-for-number-20 
  (is (= (fizzBuzz 20) "buzz"))
)

(deftest should-return-fizzbuzz-for-number-15 
  (is (= (fizzBuzz 15) "fizzbuzz"))
)

(deftest should-return-fizzbuzz-for-number-30 
  (is (= (fizzBuzz 30) "fizzbuzz"))
)

(deftest should-return-fizzbuzz-for-number-45 
  (is (= (fizzBuzz 45) "fizzbuzz"))
)
