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
  (reduce + s))

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

(defn fib1
  [[ a b ]]
  [b (+ a b)]
  )
  
(defn ex26
  ;; Write a function which returns the first X fibonacci numbers.
  ;; (= (__ 3) '(1 1 2))
  ;; (= (__ 6) '(1 1 2 3 5 8))
  ;; (= (__ 8) '(1 1 2 3 5 8 13 21))
  [n]
  ;; using iterate, we generate [a b] pairs
  (map first (take n (iterate fib1 [1 1])))
  )

(defn ex27
  ;; Write a function which returns true if the given sequence is a palindrome.

  ;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
  ;; (false? (__ '(1 2 3 4 5)))
  ;; (true? (__ "racecar"))
  ;; (true? (__ [:foo :bar :foo]))
  ;; (true? (__ '(1 1 3 3 1 1)))
  ;; (false? (__ '(:a :b :c)))
  [a]
  (= (seq a) (reverse (seq a)))
  )

(defn ex28
  ;; Write a function which flattens a sequence.
  ;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
  ;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
  ;; (= (__ '((((:a))))) '(:a))

  ;; special restrictions: flatten
  
  [s]
  (mapcat #(if (sequential? %) (ex28 %) [%]) s)
   
  )

(defn ex29

  ;; Write a function which takes a string and returns a new string containing only the capital letters.
  ;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
  ;; (empty? (__ "nothing"))
  ;; (= (__ "$#A(*&987Zf") "AZ")
  
  [s]
  (apply str (filter #(Character/isUpperCase %) s))
  )

(defn ex30

  ;; Write a function which removes consecutive duplicates from a sequence.
  ;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
  ;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
  ;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

  [s]

  (map first (partition-by identity s)))

(defn ex31

  ;; Write a function which packs consecutive duplicates into sub-lists.
  ;; (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
  ;; (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
  ;; (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
  []
  )

(defn ex32

  ;; Write a function which duplicates each element of a sequence.
  ;; (= (__ [1 2 3]) '(1 1 2 2 3 3))
  ;; (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
  ;; (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
  ;; (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
  []
  )
(defn ex33

  ;; Write a function which replicates each element of a sequence a variable number of times.
  ;; (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
  ;; (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
  ;; (= (__ [4 5 6] 1) '(4 5 6))
  ;; (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
  ;; (= (__ [44 33] 2) [44 44 33 33])
  []
  )

(defn ex34

  ;; Write a function which creates a list of all integers in a given range.
  ;; (= (__ 1 4) '(1 2 3))
  ;; (= (__ -2 2) '(-2 -1 0 1)) 
  ;; (= (__ 5 8) '(5 6 7))

  ;; special restrictions: range
  []
  )

(defn ex35

  ;; Clojure lets you give local names to values using the special let-form.
  ;; (= __ (let [x 5] (+ 2 x)))
  ;; (= __ (let [x 3, y 10] (- y x)))
  ;; (= __ (let [x 21] (let [y 3] (/ x y))))
  []
  )

(defn ex36

  ;; Can you bind x, y, and z so that these are all true?
  ;; (= 10 (let __ (+ x y)))
  ;; (= 4 (let __ (+ y z)))
  ;; (= 1 (let __ z))
  []
  )

(defn ex37
  ;; Regex patterns are supported with a special reader macro.
  ;; (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
  []
  )

(defn ex38
  ;; Write a function which takes a variable number of parameters and returns the maximum value.
  ;; (= (__ 1 8 3 4) 8)
  ;; (= (__ 30 20) 30)
  ;; (= (__ 45 67 11) 67)

  ;; special restrictions: max, max-key
  []
  )

(defn ex39
  ;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
  ;; (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
  ;; (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
  ;; (= (__ [1 2 3 4] [5]) [1 5])
  ;; (= (__ [30 20] [25 15]) [30 25 20 15])

  ;; special restrictions: interleave

  []
  )

(defn ex40
  ;; Write a function which separates the items of a sequence by an arbitrary value.
  ;; (= (__ 0 [1 2 3]) [1 0 2 0 3])
  ;; (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
  ;; (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
  ;; special restrictions: interpose

  []
  )
