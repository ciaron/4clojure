(ns fourclojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn test2
  "this is a test function"
  []
  (println "I just say hello"))

;; 4clojure exercises
;; Ex 1 - Nothing but the Truth
(= true true)

(defn ex2
  ;; (= (- 10 (* 2 3)) __)
  []
  (= (- 10 (* 2 3)) 4))

(defn ex3
  ;; (= __ (.toUpperCase "hello world"))
  []
  (= "HELLO WORLD" (.toUpperCase "hello world"))
  )

(defn ex4
  ;; (= (list __) '(:a :b :c))
  []
  (= (list :a :b :c) '(:a :b :c)) 
  )

(defn ex5
  ;; (= __ (conj '(2 3 4) 1))
  ;; (= __ (conj '(3 4) 2 1))
  
  []
  '(1 2 3 4))

(defn ex6
  ;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
  []
  [:a :b :c]
  )

(defn ex7
  ;; (= __ (conj [1 2 3] 4))
  ;; (= __ (conj [1 2] 3 4))
  []
  [ 1 2 3 4 ]
  )

(defn ex8
  ;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
  ;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
  []
  #{ :a :b :c :d }
  )

(defn ex9
  ;; (= #{1 2 3 4} (conj #{1 4 3} __))
  ;;
  []
  2)

(defn ex10
  ;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
  ;; (= __ (:b {:a 10, :b 20, :c 30}))
  []
  20
  )

(defn ex11
  ;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
  []
  {:b 2}
  )

(defn ex12
  ;; (= __ (first '(3 2 1)))
  ;; (= __ (second [2 3 4]))
  ;; (= __ (last (list 1 2 3)))
  []
  3
  )

(defn ex13
  ;; (= __ (rest [10 20 30 40]))
  []
  [20 30 40]
  )

(defn ex14
  ;; Clojure has many different ways to create functions.
  ;;	
  ;; (= __ ((fn add-five [x] (+ x 5)) 3))
  ;; (= __ ((fn [x] (+ x 5)) 3))
  ;; (= __ (#(+ % 5) 3))
  ;; (= __ ((partial + 5) 3))
  []

  8)

(defn ex15
  ;; Write a function which doubles a number.
  [x]
  (* x 2)
  )

(defn ex16

  ;; Write a function which returns a personalized greeting.
  ;; (= (__ "Dave") "Hello, Dave!")
  [name]
  (str "Hello, " name "!"))

(defn ex17
  ;; The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure.
  ;; (= __ (map #(+ % 5) '(1 2 3)))

  []
  '(6 7 8))

(defn ex18
  ;; The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true.

  ;; (= __ (filter #(> % 5) '(3 4 5 6 7)))
  []
  '(6 7))

(defn ex19
  ;; Write a function which returns the last element in a sequence.
  ;; Special restrictions: last
  ;; (= (__ [1 2 3 4 5]) 5)
  ;; (= (__ '(5 4 3)) 3)
  ;; (= (__ ["b" "c" "d"]) "d")
  [s]
  (first (reverse s))
  )

(defn ex20
  ;; Write a function which returns the second to last element from a sequence.
  ;; (= (__ (list 1 2 3 4 5)) 4)
  ;; (= (__ ["a" "b" "c"]) "b")
  ;; (= (__ [[1 2] [3 4]]) [1 2])
  [s]
  (first (rest (reverse s)))
  )

(defn ex21

  ;; Write a function which returns the Nth element from a sequence.
  ;; (= (__ '(4 5 6 7) 2) 6)
  ;; (= (__ [:a :b :c] 0) :a)
  ;; (= (__ [1 2 3 4] 1) 2)
  ;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
  ;; Special restrictions: nth

  [coll index]

  (first (drop index coll)))

(defn ex22
  ;; Write a function which returns the total number of elements in a sequence.
  ;; (= (__ '(1 2 3 3 1)) 5)
  ;; (= (__ "Hello World") 11)
  ;; (= (__ [[1 2] [3 4] [5 6]]) 3)
  ;; (= (__ '(13)) 1)
  ;; (= (__ '(:a :b :c)) 3)
  ;; special restrictions: count
  [s]
  (reduce + (map (constantly 1) s)))

(defn ex23
  ;; Write a function which reverses a sequence.
  ;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
  ;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
  ;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
  ;; special restrictions: reverse, rseq
  [s]
  (reduce conj () s)
  )

(defn ex24
  ;; Write a function which returns the sum of a sequence of numbers.
  ;; (= (__ [1 2 3]) 6)
  ;; (= (__ (list 0 -2 5 5)) 8)
  ;; (= (__ #{4 2 1}) 7)
  ;; (= (__ '(0 0 -1)) -1)
  ;; (= (__ '(1 10 3)) 14)

  [s]
  (reduce + a))

(defn ex25
  ;; Write a function which returns only the odd numbers from a sequence.
  ;; (= (__ #{1 2 3 4 5}) '(1 3 5))
  ;; (= (__ [4 2 1 6]) '(1))
  ;; (= (__ [2 2 4 6]) '())
  ;; (= (__ [1 1 1 3]) '(1 1 1 3))

  [s]
  (filter #(= 1 (mod % 2)) s)
  ;; or
  ;; (filter odd? s)
  )

(defn ex26
  ;; Write a function which returns the first X fibonacci numbers.
  ;; (= (__ 3) '(1 1 2))
  ;; (= (__ 6) '(1 1 2 3 5 8))
  ;; (= (__ 8) '(1 1 2 3 5 8 13 21))
  []
  )

