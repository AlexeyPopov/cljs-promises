(defproject alexeypopov/cljs-promises "0.1.0"
  :description "A ClojureScript library for working with JavaScript promises. Fork with resolve warning fix"

  :url "https://github.com/AlexeyPopov/cljs-promises"

  :scm {:name "git"
        :url "https://github.com/AlexeyPopov/cljs-promises"}

  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.474"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :source-paths ["src"]

  :cljsbuild {
              :builds [{:id "examples"
                        :source-paths ["src" "examples/src"]
                        :compiler {
                                   :output-to "examples/js/examples.js"
                                   :output-dir "examples/out"
                                   :optimizations :none
                                   :source-map true}}]})
