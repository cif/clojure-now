(ns clojure-now.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn handler [request]
  {:status 200
    :headers {"Content-Type" "text/plain"}
    :body "Heyo!"})

(defn -main [&args]
  jetty/run-jetty {:port 80})
