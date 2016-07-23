(ns clojure-katas.core-test
  (:require [clojure.test :refer :all]
            [clojure-katas.core :refer :all]))

(deftest should-fizzbuzz-number 
  (are [number expected] (= expected (fizzBuzz number))
    1 "1"
    2 "2"
    3 "fizz"
    6 "fizz"
    9 "fizz"
    5 "buzz"
    10 "buzz"
    20 "buzz"
    15 "fizzbuzz"
    30 "fizzbuzz"
    45 "fizzbuzz"))
