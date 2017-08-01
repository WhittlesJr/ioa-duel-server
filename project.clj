(defproject ioa-duel-server "0.1.0-SNAPSHOT"
  :description "Web server application for the IoA-Duel game (WIP)"
  :url "http://invokeawesome.com/duel"
  :uberjar-name "ioa-duel-server-standalone.jar"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.5.0"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [environ "1.0.0"]]
  :plugins [[environ/environ.lein "0.3.1"]]
  :hooks [environ.leiningen.hooks]
  :profiles {:production {:env {:production true}}})
