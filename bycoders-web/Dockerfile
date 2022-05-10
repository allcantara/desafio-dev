FROM node:16

WORKDIR /app/web

COPY package*.json /app/web
RUN npm install

COPY . /app/web

EXPOSE 3000

ENTRYPOINT ["npm", "start"]