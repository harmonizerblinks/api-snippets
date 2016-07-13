<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once '/path/to/vendor/autoload.php'; // Loads the library
use Twilio\Rest\Client;

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
$token = "your_auth_token";
$client = new Client($sid, $token);

$number = $client->account->incomingPhoneNumbers->create(
    array(
        "voiceUrl" => "http://demo.twilio.com/docs/voice.xml",
        "phoneNumber" => "+15005550006"
    )
);

echo $number->sid;
