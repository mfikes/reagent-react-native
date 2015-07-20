(defproject awesome-project "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [reagent "0.5.0" :exclusions [cljsjs/react]]
                 [org.omcljs/ambly "0.6.0"]]
  :plugins [[lein-cljsbuild "1.0.6"]]
  :cljsbuild {:builds {:dev {:source-paths ["src"]
                             :compiler {:output-to "target/out/main.js"
                                        :output-dir "target/out"
                                        :optimizations :none}}}})
