(ns clojure-katas.core-test
  (:require [clojure.test :refer :all]
            [clojure-katas.core :refer :all]))

(deftest should-fizzbuzz-number 
  (is (= (fizzBuzz 1) 1))
  (is (= (fizzBuzz 2) 2))
  (is (= (fizzBuzz 3) "fizz"))
  (is (= (fizzBuzz 6) "fizz"))
  (is (= (fizzBuzz 9) "fizz"))
  (is (= (fizzBuzz 5) "buzz"))
  (is (= (fizzBuzz 10) "buzz"))
  (is (= (fizzBuzz 20) "buzz"))
  (is (= (fizzBuzz 15) "fizzbuzz"))
  (is (= (fizzBuzz 30) "fizzbuzz"))
  (is (= (fizzBuzz 45) "fizzbuzz"))
)
