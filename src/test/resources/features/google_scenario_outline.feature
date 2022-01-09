@google_scenario_outline
  Feature: Data driven testing using Scenario outline with Example table

    Scenario Outline: Google capital cities search
      Given User is on the google home page
      When User searches for "<country>"capital
      Then User should see "<capital>"in the result
      Examples:
        | country      | capital          |
        | USA          | Washington, D.C. |
        | Turkey       | Ankara           |
        | Ukraine      | Kyiv             |
        | Turkmenistan | Ashgabat         |
        | Latvia       | Riga             |
        | Uzbekistan   | Tashkent         |
        | Eritrea      | Asmara           |
        | Afghanistan  | Kabul            |