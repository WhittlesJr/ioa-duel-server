(ns ioa-duel-server.core
  (:require [ring.adapter.jetty :as jetty]
            [environ.core :refer [env]])
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 5000))]
    (jetty/run-jetty handler {:port port})))
