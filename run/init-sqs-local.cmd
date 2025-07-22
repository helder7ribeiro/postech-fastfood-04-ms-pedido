@echo off
echo ### Executando script de inicialização do SQS na AWS ###

echo Criando a fila para receber confirmações de pagamento: fila-pedidos...
aws sqs create-queue --queue-name fila-pedidos

echo Criando a fila para publicar resultados de pagamento: fila-pagamentos...
aws sqs create-queue --queue-name fila-pagamentos

echo Listando as filas SQS para verificação:
aws sqs list-queues

echo ### Script de inicialização do SQS concluído ###