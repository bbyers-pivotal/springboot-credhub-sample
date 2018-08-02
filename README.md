**Steps**

1) Create Credhub service with values needed for application
`cf create-service credhub default mycredhub -c '{"mysecretkey":"somethingsecret"}'`
1) Update the `CredhubProperties` class with those keys you added along with the name of the service you chose
1) Reference `CredhubValueController` to see how to use the values