(ns tutorial.namespaces
  (:require [clojure.string :refer [capitalize]]))

(defn -main
  []
  (println (capitalize "hello"))
  )

(-main)