Feature: Automate Clicking the Video
Scenario Outline: Login and clicks on Daily link video

Given user login with <Username> and <Password>
Then user watches two youtube video from daily link


Examples:
|Username|Password|
|tkgautham|123123|
|tkpreetham|123123|
|supraja|123123|
|lakshmik|123123|
|amudhamurali|123123|

Scenario Outline: Login and clicks on Daily link video

Given user login with <Username> and <Password>
Then user watches two youtube video from bonus link

Examples:
|Username|Password|
|tkgautham|123123|
|tkpreetham|123123|
|supraja|123123|
|lakshmik|123123|
